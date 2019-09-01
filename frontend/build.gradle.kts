plugins {
  kotlin("jvm") version "1.2.71"
  id("com.moowork.node") version "1.2.0"
}

node {
  version = "12.6.0"
  npmVersion = "6.9.0"
  download = true
}


tasks {
  jar {
    dependsOn ("npm_install")
    from("dist/multi-pomodoro" ) {
      into("static")
    }
  }
}
