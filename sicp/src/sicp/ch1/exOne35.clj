(ns ch1.exOne35
    (:use [clojure.repl])
    (:gen-class))

;;let x=1+1/x and solve the equation

;;half-internal method(find the roots of equations)
(defn search [f neg-point pos-point]
    (let [midpoint (average neg-point pos-point)]
        (if (close-enough? neg-point pos-point) 
            midpoint
            (let [test-value (f midpoint)]
                (cond (positve? test-value)
                      (search f neg-point midpoint)
                      (negative? test-value)
                      (search f midpoint pos-point)
                      :else midpoint)))))

(defn close-enough? [x y]
    (< (abs (- x y)) 0.001))

;;to check if both points meet the condition(> <)
(defn half-internal-method [f a b]
    (let [a-value (f a) b-value (f b)]
        (cond (and (negative? a-value) (positve? b-value))
              (search f a b)
              (and (negative? b-value) (positve? a-value))
              (search f b a)
              :else (println "Values are not of opposite sign" a b))))

;;fixed point
;;until the values do not change very much
(defn fixed-point [f first-guess]
    (defn close-enough? [v1 v2]
        (< (abs (- v1 v2)) tolerance))
    (defn try [guess]
        (let [next (f guess)]
            (if (close-enough? guess next)
                next
                (try next))))
    (try first-guess))

(def tolerance 0.00001)
