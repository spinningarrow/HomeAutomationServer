(defproject daikin-lirc-conf "1.0.0-SNAPSHOT"
  :description "A Clojure project with a little bit of Java sprinkled here and there"
  :min-lein-version  "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^skip-aot daikin.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :source-paths      ["src/main/clojure"]
  :java-source-paths ["src/main/java"])

