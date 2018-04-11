(defproject daikin-lircd-generator "1.0.0-SNAPSHOT"
  :description "Generate a LIRC remote config for Daikin air conditioners"
  :min-lein-version  "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^skip-aot daikin.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :source-paths      ["src/main/clojure"]
  :java-source-paths ["src/main/java"])

