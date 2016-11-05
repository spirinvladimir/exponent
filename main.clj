(defn fac [n]
  (reduce * (range 1 (inc n))))

(defn member [x n]
  (/
     (Math/pow x n)
     (fac n)))

(defn sum [x n]
  (reduce
    (fn [s i]
      (+ s (member x i)))
    1
    (range 1 n)))

(defn e [x]
  (sum x 10))

(defn getN []
  (Integer/parseInt (read-line)))

(defn getX []
  (Float/parseFloat (read-line)))

(loop [n (getN)]
  (println (e (getX)))
  (if (> n 1)
    (recur (dec n))))
