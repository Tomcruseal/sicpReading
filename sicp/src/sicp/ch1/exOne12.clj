(ns ch1.exOne12
    (:use [clojure.repl])
    (:gen-class))

(defn Yanghui [layer index]
    (cond (or (= index 1) (= index layer)) 1
          :else (+ (Yanghui (- layer 1) (- index 1))
                (Yanghui (- layer 1) index))))