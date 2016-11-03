load("@bazel_tools//tools/build_defs/pkg:pkg.bzl", "pkg_tar", "pkg_deb")
load("@bazel_tools//tools/build_defs/docker:docker.bzl", "docker_build")

java_binary (
  name = "hello",
  main_class = 'Hello',
  srcs = [
    "Hello.java",
  ],
)

pkg_tar(
  name = "hello-bin",
  package_dir = "/usr/bin",
  files = [":hello_deploy.jar"],
  mode = "0755",
)

docker_build(
  name = "hello-docker",
  base = "//codelab/docker:base",
  tars = [
    ":hello-bin",
  ]
)
