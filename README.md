# auto-generate-swagger-docs
A Rest API Spring application with the auto-generated Swagger and auto-publish to Confluence via Jenkins

## Overview
In the world of rapid changes in software development, the documentation is sometimes outdated pretty fast.
This project is somehow to get updated for API implementation by auto-generated Swagger file and publish
a common wiki page (Confluence in this case).

## Technologies
* Spring Boot 2
* Spring Fox Swagger
* Jenkins / Confluence plugin

## How to run
* Run **gradle build** will trigger tests including SwaggerGeneratorTest to update swagger automatically.

## How to publish via Jenkins
https://jenkins.io/doc/pipeline/steps/confluence-publisher/
