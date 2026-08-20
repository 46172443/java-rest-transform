package com.example.text_transform_api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/v1")
@RestController
public class texttransformapiController {
        @PostMapping("/transform")
        public TestResponse transformText(@RequestBody TextRequest request) {
            // Implement your text transformation logic here
            String text = request.text();; // Example transformation
            return new TestResponse(
                text,
                text.toUpperCase(),
                text.toLowerCase(),
                text.length()
            );
        }
}