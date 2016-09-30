load("//devtools/bazel/rules_groovy/groovy:groovy.bzl", "groovy_library", "spock_test")

groovy_library(
    name = "groovylib",
    srcs = ["Hello.groovy"],
)

spock_test(
  name = "LibTest",
  specs = ["HelloTest.groovy"],
)
