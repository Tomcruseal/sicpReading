(ns ch1.exOne19
    (:use [clojure.repl])
    (:gen-class))

(defn fib-fast [n]
    (fib-iter 1 0 0 1 n))

;;in trivial fibonacci iter,a \leftarrow a+b
;;b \leftarrow a,which is denoted as T-transformation
;;in general, a \leftarrow bq+aq+ap and
;;b \leftarrow bp+aq
;;it can be proven that applying T_pq  twice is equivalent to
;;applying certain T_p'q' for one time.Following this, an 
;;\Theta(\logn)algorithm can be obtained

(defn fib-iter [a b p q count]
    (cond ((= count 0) b)
          ((even? count) (fib-iter a
                                   b
                                   (+ (* p p) (* q q))
                                   (+ (* 2 p q) (* q q))
                                   (/ count 2)))
            :else (fib-iter (+ (* b q) (* a q) (* a p))
                            (+ (* b p) (* a q))
                            p
                            q
                            (- count 1))))
              