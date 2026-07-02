# event-lib

## Overview
`event-lib` is a shared library for the Vendo ecosystem that provides common Kafka event models and event type enums used across microservices. It ensures a consistent event contract for asynchronous, event-driven communication across the platform.

## Features

* Kafka event classes representing the payloads exchanged between services
* Enums for event types, ensuring consistent naming and handling across producers and consumers
* Shared event contracts that reduce duplication and prevent schema drift between services
* Easy integration into any module of the Vendo ecosystem via a Maven dependency

## Installation
Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>io.github.vendo-marketplace-be</groupId>
    <artifactId>event-lib</artifactId>
    <version>latest-version</version>
    <packaging>jar</packaging>
</dependency>
```

## Usage
Once the dependency is added, the event classes and enums from `event-lib` become available for direct import in any module of the project — both on the producer and the consumer side.

Example:

```java
import com.vendo.event_lib.product.ProductCreatedEvent;

// Producer side
ProductCreatedEvent event = ProductCreatedEvent.builder().build();

kafkaTemplate.send("product-image-events", event);

        // Consumer side
        @KafkaListener(topics = "product-image-events")
        public void handle(ProductImageEvent event) {
                // handle event
            }
        }
```

## Requirements

* Java 17

## Notes
This library is intended solely for internal use within the Vendo ecosystem (`com.vendo`). Since event classes act as a contract between producers and consumers, changes to existing event fields or event types should be treated with caution — adding new fields/types is generally safe, but removing or renaming existing ones is a breaking change for all consuming services.