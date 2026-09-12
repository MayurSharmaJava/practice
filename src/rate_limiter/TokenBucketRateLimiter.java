package rate_limiter;

public class TokenBucketRateLimiter {

    private long capacity;
    private double tokens;
    private double refillRate; // tokens per second
    private long lastRefillTimestamp;

    public TokenBucketRateLimiter(long capacity, double refillRate) {
        this.capacity = capacity;
        this.tokens = capacity;
        this.refillRate = refillRate;
        this.lastRefillTimestamp = System.nanoTime();
    }

    public synchronized boolean allowRequest() {
        refillTokens();
        if (tokens >= 1) {
            tokens -= 1;
            return true;
        }
        return false;
    }

    private void refillTokens() {
        long now = System.nanoTime();
        double elapsedSeconds = (now - lastRefillTimestamp) / 1_000_000_000.0;
        tokens = Math.min(capacity, tokens + elapsedSeconds * refillRate);
        lastRefillTimestamp = now;
    }


}
