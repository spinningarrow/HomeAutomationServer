(ns daikin.core
  (:import (daikin DaikinPackage WorkingState ModeState FanState SwingState))
  (:gen-class))

(defn dp-config
  [power mode degrees fan hswing vswing]
  (doto (DaikinPackage.)
    (.setHeader1)
    (.setHeader2)
    (.setHeader3)
    (.setWorkingState (.getState (WorkingState/valueOf power)))
    (.setModeTo (.getState (ModeState/valueOf mode)))
    (.setDegreesTo degrees)
    (.setFanTo (.getState (FanState/valueOf fan)))
    (.setHorizontalSwingState (.getState (SwingState/valueOf hswing)))
    (.setVerticalSwingState (.getState (SwingState/valueOf vswing)))))

(defn configs-with-headers
  [configs]
  (concat [(.getStartPattern (DaikinPackage.))]
          (map #(.getLircNameAndData %) configs)
          [(.getClosingPattern (DaikinPackage.))]))

(defn -main
  [& args]
  (let [configs [(dp-config "OFF" "COOL" 21 "FANSILENT" "SWINGOFF" "SWINGOFF")
                 (dp-config "ON" "COOL" 24 "FANSILENT" "SWINGOFF" "SWINGOFF")]]
    (println (clojure.string/join (configs-with-headers configs)))))
