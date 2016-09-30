load("//devtools/bazel/rules_groovy/groovy:groovy.bzl", "groovy_library", "spock_test", "groovy_binary")

groovy_binary(
    name = "hello",
    main_class = "Main",
    srcs = ["Hello.groovy"],
)

spock_test(
  name = "HelloTest",
  suites = [
    "HelloSpec",
  ],
  specs = ["HelloTest.groovy"],
)
