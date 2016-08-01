import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()
instance.setNumExecutors(3);

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("jenkins","jenkins")
instance.setSecurityRealm(hudsonRealm)


//def strategy = new GlobalMatrixAuthorizationStrategy()
//strategy.add(Jenkins.ADMINISTER, "jenkins")
//instance.setAuthorizationStrategy(strategy)

def strategy = new hudson.security.FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(false)
instance.setAuthorizationStrategy(strategy)
instance.save()
