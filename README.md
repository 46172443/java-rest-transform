# REST API Transform Service

Accepts JSON with a `text` field via POST. Returns the original text, uppercase and lowercase versions, and the character count.

**Demonstrates:** Spring Boot REST endpoint, JSON request/response handling, and the `@PostMapping` annotation.

**Why this:** REST APIs are common in integration engineering and product-focused backend roles. This service demonstrates the core API loop: accept an HTTP request, parse JSON, transform data, and return a structured response.

## Test

Start the application, then send:

```bash
curl -X POST http://localhost:8080/api/v1/transform \
  -H "Content-Type: application/json" \
  -d '{"text":"hello java"}'
Response:

{
  "original": "hello java",
  "upper": "HELLO JAVA",
  "lower": "hello java",
  "length": 10
}
