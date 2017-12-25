(ns ch1.exOne36
    (:use [clojure.repl])
    (:gen-class))

(defn fixed-point [f first-guess]
    (defn close-enough? [v1 v2]
        (< (abs (- v1 v2)) tolerance))
    (defn try [guess]
        (let [next (f guess)]
            (if (close-enough? guess next)
                next
                (do (println next)
                (try next)))))
    (try first-guess))

(def tolerance 0.00001)
;;TODO: check the grammar
