Uses signed JARs (not the PGP signed ones, the ones signed with `jarsigner`) with Spring Boot 3 and AOT mode.

```
gradle bootRun
```

Problem here is that the `DependencyAutoConfiguration` is in the `dependency.jar`, which has a signature on it. The AOT
mode generates code (`dependency.DependencyAutoConfiguration__BeanDefinitions`) in the same package as
the `dependency.jar` contains.
