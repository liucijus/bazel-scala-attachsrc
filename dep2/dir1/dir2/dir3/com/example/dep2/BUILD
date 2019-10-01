load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "dep2",
    srcs = [
        ":sources"
    ],
    visibility =  ["//visibility:public"],
)

filegroup(
    name = "sources",
    srcs = glob(["*.java"]) + glob(["*.scala"]),
    visibility = ["//visibility:public"],
)