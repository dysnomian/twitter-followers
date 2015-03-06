(defproject twitter-followers "0.1.0-SNAPSHOT"
  :description "Collects Redis Pub/Sub"
  :url "http://github.com/dysnomian/twitter-followers"
  :license {:name "MIT License"
            :url "http://choosealicense.com/licenses/mit/"}
  :dependencies [
                 [org.clojure/clojure "1.6.0"]
                 [twitter-api "0.7.8"]
                 [com.taoensso/carmine "2.9.0"]
                 ]
  :main ^:skip-aot twitter-followers.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
