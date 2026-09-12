package rate_limiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenBucketRateLimiterTest {

    public static void main(String[] args) {
        TokenBucketRateLimiter rateLimiter = new TokenBucketRateLimiter(5, 1); // 5 tokens, 1 token per second

        // Allow 5 requests immediately
        for (int i = 0; i < 5; i++) {
            System.out.println(rateLimiter.allowRequest()); // Should print true
        }

        // The 6th request should be denied
        System.out.println(rateLimiter.allowRequest()); // Should print false

        // Wait for 1 second to refill tokens
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Now the next request should be allowed
        System.out.println(rateLimiter.allowRequest()); // Should print true
    }

}