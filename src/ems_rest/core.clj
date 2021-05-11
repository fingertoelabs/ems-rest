(ns ems-rest.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Ring! Does the War file work on IBMi??"})

(defn -main []
  "I don't do anything yet")
