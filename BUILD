load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")

scala_library(
    name = "mainlib",
    srcs = glob(["src/**/*scala"]),
    deps = ["ext_deps"],
)

scala_import(
    name = "ext_deps",
    visibility = ["//visibility:public"],
    exports = [
        "//dep1",
        "//dep2/dir1/dir2/dir3/com/example/dep2",
        "//dep3/f1/f2/f3/com/example3",
    ],
)
