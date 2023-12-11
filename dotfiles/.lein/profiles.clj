{:user
 {
  :plugins [[lein-cljfmt "0.9.2"] ; reformat
            [lein-ancient "0.7.0"] ; check out-of-date artifact
            [lein-kibit "0.1.8"] ; lint
            [jonase/eastwood "1.4.2"] ; lint
            [venantius/yagni "0.1.7"] ; check dead code
            [lein-bikeshed "0.5.2"] ; another lint tool
            [lein-auto "0.1.3"] ; watches the project source directories, and executes a task when it detects changes to files matching a set pattern
            ]
  :dependencies [[hashp "0.2.2"]] ; https://github.com/weavejester/hashp
  :injections [(require 'hashp.core)]
  }
 }
