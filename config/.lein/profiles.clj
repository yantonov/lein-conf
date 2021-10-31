{:user
 {
  :plugins [[lein-cljfmt "0.8.0"] ; reformat
            [lein-ancient "0.7.0"] ; check out-of-date artifact
            [lein-kibit "0.1.8"] ; lint
            [jonase/eastwood "0.9.9"] ; lint
            [venantius/yagni "0.1.7"] ; check dead code
            [lein-bikeshed "0.5.2"] ; another lint tool
            [lein-auto "0.1.3"] ; watches the project source directories, and executes a task when it detects changes to files matching a set pattern
            ]
  :dependencies [[hashp "0.2.1"]] ; https://github.com/weavejester/hashp
  :injections [(require 'hashp.core)]
  }
 :repl
 {
  :user
  {
   :dependencies [[org.clojure/tools.namespace "0.3.1"] ; reload ns
                  [org.clojure/tools.nrepl "0.2.13"]]
   :plugins [[refactor-nrepl "2.4.0"]
             [cider/cider-nrepl "0.22.4"]]
   :injections [(require '[clojure.tools.namespace.repl :refer [refresh]])
                (refresh)
                (use 'clojure.repl)
                (use 'clojure.java.javadoc)
                (require 'hashp.core)]
   }
  }
 }
