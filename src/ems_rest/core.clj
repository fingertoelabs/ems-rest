(ns ems-rest.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Ring! Am I reloadable?"})

(defn -main []
  "I don't do anything yet")
