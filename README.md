External sources related issues repro for Scala

Important: to reproduce source attachment problems project view must have **only** src as sources. Use 
  `main.bazelproject` as reproducible project view file.
  
Demonstrates the following issues:
1. Fails to attach Scala sources for dep1
   ```
   unzip -l bazel-bin/dep1/dep1-src.jar 
   Archive:  bazel-bin/dep1/dep1-src.jar
     Length      Date    Time    Name
   ---------  ---------- -----   ----
           0  2010-01-01 00:00   META-INF/
          48  2010-01-01 00:00   META-INF/MANIFEST.MF
           0  2010-01-01 00:00   com/
           0  2010-01-01 00:00   com/example/
           0  2010-01-01 00:00   com/example/dep1/
          87  2010-01-01 00:00   com/example/dep1/Hi.scala
   ---------                     -------
         135                     6 files
  
   ```
  
   Open `Main` class and drill down to sources of `com.example.dep1.Hi`. 
      
   Expected: sources are attached automatically from source jar
   
   Actual: breadcrumb presented to attach sources manually
 
2. Fails to attach Scala (also for Java) sources for dep2, which generates source jar with unconventional paths. Source 
   jar is genarated this way because sources are definde using `filegroup`

   ```
   unzip -l bazel-bin/dep2/dir1/dir2/dir3/com/example/dep2/dep2-src.jar 
   Archive:  bazel-bin/dep2/dir1/dir2/dir3/com/example/dep2/dep2-src.jar
     Length      Date    Time    Name
   ---------  ---------- -----   ----
           0  2010-01-01 00:00   META-INF/
          48  2010-01-01 00:00   META-INF/MANIFEST.MF
           0  2010-01-01 00:00   dep2/
           0  2010-01-01 00:00   dep2/dir1/
           0  2010-01-01 00:00   dep2/dir1/dir2/
           0  2010-01-01 00:00   dep2/dir1/dir2/dir3/
           0  2010-01-01 00:00   dep2/dir1/dir2/dir3/com/
           0  2010-01-01 00:00   dep2/dir1/dir2/dir3/com/example/
           0  2010-01-01 00:00   dep2/dir1/dir2/dir3/com/example/dep2/
          96  2010-01-01 00:00   dep2/dir1/dir2/dir3/com/example/dep2/Hello.scala
   ---------                     -------
         144                     10 files
   
   ```
   Open `Main` class and drill down to sources of `com.example.dep2.Hello`. 
   
   Expected: sources are attached automatically from source jar
 
   Actual: breadcrumb presented to attach sources manually


