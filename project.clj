(defproject ems-rest "0.1.0-SNAPSHOT"
  :description "Easy made simple rest app"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler ems-rest.core/ring-handler
         :auto-reload? true
         :auto-refresh? true
         :nrepl {:start? true :port 4646}}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ring/ring-core "1.9.3"]
                 [ring/ring-jetty-adapter "1.9.3"]
                 [javax.servlet/servlet-api "2.5"]
                 [metosin/reitit "0.5.13"]
                 [metosin/jsonista "0.2.6"]]
  :main ems-rest.core)
