#!/bin/bash
# Compiles everything but symlinks.
# Symlinks can confuse the compiler because their filenames can differ from their origins.
# You can run this to ensure that all of the source files compile.
javac $(find . -mindepth 1 ! -type l -name \*.java)
