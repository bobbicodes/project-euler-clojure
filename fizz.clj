(defn fb [n] (or (= 0 (rem n 3)) (= 0 (rem n 5))))
(reduce + (filter fb (range 1000)))
