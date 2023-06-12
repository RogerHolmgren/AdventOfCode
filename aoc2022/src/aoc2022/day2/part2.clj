(ns aoc2022.day2.part2
  (:require
    [clojure.string :as str]))

(def input (str/split 
             (slurp "src/aoc2022/day2/data") #"\n"))

(reduce + (for [guide input]
            (let [elfs-choice (str (first guide)) my-choice (str (last guide))]
              (case elfs-choice
                "A" (case my-choice "X" 3 "Y" 4 "Z" 8)
                "B" (case my-choice "X" 1 "Y" 5 "Z" 9)
                "C" (case my-choice "X" 2 "Y" 6 "Z" 7)
                ))))

