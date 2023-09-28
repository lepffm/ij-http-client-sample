# example for IntelliJ http client test

## prerequisites
- install jdk 17 (for ijhttp)
- install ij-http-cli from https://jb.gg/ijhttp/latest

## application run
```
./gradlew bootRun
```

## api test execution
```
ijhttp test/api/message-test-suite.http --report --env-file=test/api/local.env.json --env=local
```

## API example
```java
    @GetMapping("/message") : List
    @PostMapping("/message") (@RequestBody msg: Message) : List
```

### http client test sample
```
###
GET {{HOST}}/message

###
POST {{HOST}}/message
Content-Type: application/json

{ "id": "inputId", "text": "inputVal"}
```

### test report example
```xml
<testsuites tests="6" name="IntelliJ IDEA HTTP Client">
  <testsuite tests="6" name="message-test-suite" failures="0" errors="0" skip="0">
    <testcase classname="http._1" name="GET /message" time="0.004" />
    <testcase classname="http._2" name="POST /message" time="0.016" />
    ...
  </testsuite>
</testsuites>
```

## customizing
- test suite name : http file name e.g, `your-test-suite-name`.http 
- test case name : test function name  e.g, `client.test('your-test-case-name', () => {})`

## references
- https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html
- https://www.jetbrains.com/help/idea/http-client-cli.html