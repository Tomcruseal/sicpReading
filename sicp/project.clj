(defproject sicp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  ;:main ^:skip-aot sicp.core
  :source-paths ["src" "src/sicp/ch1" "src/sicp/ch2"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
