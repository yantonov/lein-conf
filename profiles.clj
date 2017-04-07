{:user
 {:plugins [[lein-cljfmt "0.5.6"] ; reformat
            [lein-ancient "0.6.10"] ; check out-of-date artifact
            [venantius/ultra "0.5.1"] ; pretty print test output, stacktraces
            [lein-kibit "0.1.3"] ; lint
            [jonase/eastwood "0.2.3"] ; lint
            [venantius/yagni "0.1.4"] ; check dead code
            [lein-bikeshed "0.4.1"] ; another lint tool
            ]
  }
 :repl
 {:dependencies [[org.clojure/tools.namespace "0.2.11"] ; reload ns
                 [alembic "0.3.2"]
                 [org.clojure/tools.nrepl "0.2.13"]
                 ]
  :plugins [[refactor-nrepl "2.3.0"]
            [cider/cider-nrepl "0.14.0"]]
  :injections [(require '[clojure.tools.namespace.repl :refer [refresh]])
               (refresh)
               (require 'alembic.still)
               (use 'clojure.repl)
               (use 'clojure.java.javadoc)]
  }}
