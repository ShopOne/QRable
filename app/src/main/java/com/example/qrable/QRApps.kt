package com.example.qrable

class QRApps(appType: QRAppsType){
    var imageId = 0
    var appName = ""
    init{
        when(appType){
            QRAppsType.LINE_PAY->{
                appName="Line Pay"
                imageId=R.drawable.linepay
            }
            QRAppsType.AU_PAY->{
                appName="au Pay"
                imageId=R.drawable.aupay
            }
            QRAppsType.DOCOMO_PAY->{
                appName="Docomo Pay"
                imageId=R.drawable.undef
            }
            QRAppsType.MER_PAY->{
                appName="Merukari Pay"
                imageId=R.drawable.undef
            }
            QRAppsType.PAY_PAY->{
                appName="PayPay"
                imageId=R.drawable.paypay
            }
            QRAppsType.RAKUTEN_PAY->{
                appName="Rakuten Pay"
                imageId=R.drawable.rakutenpay
            }
            else ->{
                appName="Undefined"
                imageId=R.drawable.undef
            }
        }
    }
    fun hoge(): Int{
        return imageId
    }
}