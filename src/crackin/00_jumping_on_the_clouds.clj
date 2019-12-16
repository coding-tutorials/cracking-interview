;https://www.hackerrank.com/challenges/jumping-on-the-clouds
(ns crackin.00-jumping-on-the-clouds)

(defn jump [clouds]
  (let [clouds-count (count clouds)]
    (reduce
      (fn [[index jumps] _]
        (if (< index (dec clouds-count))
          (let [next (nth clouds (inc index) 0)
                next2 (nth clouds (+ 2 index) 0)]
            (cond
              (= next2 0)
              [(+ 2 index) (inc jumps)]
              (= next 0)
              [(+ 1 index) (inc jumps)]
              :else (println "next2: " next2 " next: " next)))
          [index jumps]))
      [0 0]
      clouds)))
  
(defn execute [c]
  (second (jump c)))
