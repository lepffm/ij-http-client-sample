# example for IntelliJ http client test

## prerequisites
- install jdk
- install ij-http-cli

## application run
```
./gradlew bootRun
```

## api test execution
```
ijhttp test/api/message.rest --report --env-file=test/api/local.env.json --env=local
```

##
- test suite name : http file name e.g, `your-test-suite-name.http` 
- test case name : test function name  e.g, `client.test('your-test-case-name', () => {})`
