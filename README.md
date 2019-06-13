# VStackBarFlow

Vaadin 14 Java integration of https://github.com/jcgueriaud1/v-stack-bar

## Development instructions

JavaScript modules can either be published as an NPM package or be kept as local in
the jar file.
Any non published JavaScript modules should be put in `src/main/resources/META-INF/frontent`
so that they are automatically found and copied in the using application.

If the modules are published then the package should be noted in the
component using the `@NpmPackage` annotation in addition to using 
`@JsModule`.

Starting the test/demo server:
```
mvn jetty:run -P demo
```

This deploys demo at http://localhost:8080

