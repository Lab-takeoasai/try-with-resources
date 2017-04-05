# Try-with-Resources in Java

## TD;DR

```java
try (MockConnection connection = new MockConnection();) {
    something();
    return;
}
```

This connection is always closed.

## Test

```bash
$ gradle run
```
