class Stop(arname:String,zdA;String,arAcc :String="unknowkn" ,arAudibale:String="unknowkn",arVisu:String="unknowkn", point:Point,m:Mode) {
    private val arRname : String =
    private val zdAid : String = zdA
    private val pos= point
    private var arAccess :Short = -1
    private var arAudibaleSignal :Short= -1
    private var arVisual : Short = -1
    private val mode : Mode = m
    init{
        arAccess = initArrHandicap(arAcc)
        arAudibaleSignal = initArrHandicap(arAudibale)
        arVisual = initArrHandicap(arVisu)

    }

    private fun initArrHandicap(arHand : String) =
        when(arHand){
            "unknowkn" -> -1
            "false" -> 0
            "true" -> 1
            else -> -2
    }
}