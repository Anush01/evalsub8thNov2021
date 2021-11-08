package com.anushmp.randomusermvvm.datamodels.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userdata")
data class RandomUserEntity(
    @ColumnInfo(name = "gender")
    var Responsegender:String,
    @ColumnInfo(name = "Nametitle")
    var ResponseNametitle:String,
    @ColumnInfo(name = "Namefirst")
    var ResponseNamefirst:String,
    @ColumnInfo(name = "Namelast")
    var ResponseNamelast:String,
    @ColumnInfo(name = "LocationStreetNumber")
    var ResponseLocationStreetNumber:String,
    @ColumnInfo(name = "LocationStreetName")
    var ResponseLocationStreetName:String,
    @ColumnInfo(name = "LocationCity")
    var ResponseLocationCity:String,
    @ColumnInfo(name = "LocationState")
    var ResponseLocationState:String,
    @ColumnInfo(name = "LocationCountry")
    var ResponseLocationCountry:String,
    @ColumnInfo(name = "Locationpostcode")
    var ResponseLocationpostcode:String,
    @ColumnInfo(name="LocationCoordinatesLatitude")
    var ResponseLocationCoordinatesLatitude:String,
    @ColumnInfo(name = "LocationCoordinatesLongitude")
    var ResponseLocationCoordinatesLongitude:String,
    @ColumnInfo(name = "LocationTimeZoneOffset")
    var ResponseLocationTimezoneOffset:String,
    @ColumnInfo(name = "LocationTimezoneDescription")
    var ResponseLocationTimezoneDescription:String,
    @ColumnInfo(name = "email")
    var Responseemail:String,
    @ColumnInfo(name = "Loginuuid")
    var ResponseLoginuuid:String,
    @ColumnInfo(name = "Loginusername")
    var ResponseLoginusername:String,
    @ColumnInfo(name = "Loginpassword")
    var ResponseLoginpassword:String,
    @ColumnInfo(name = "Loginsalt")
    var ResponseLoginsalt:String,
    @ColumnInfo(name = "Loginmd5")
    var ResponseLoginmd5:String,
    @ColumnInfo(name = "Loginsha1")
    var ResponseLoginsha1:String,
    @ColumnInfo(name = "Loginsha256")
    var ResponseLoginsha256:String,
    @ColumnInfo(name = "DOBdate")
    var ResponseDOBdate:String,
    @ColumnInfo(name = "DOBage")
    var ResponseDOBage:String,
    @ColumnInfo(name = "RegisteredDate")
    var ResponseRegisteredDate:String,
    @ColumnInfo(name = "RegisteredAge")
    var ResponseRegisteredAge:String,
    @ColumnInfo(name = "phone")
    var Responsephone:String,
    @ColumnInfo(name = "cell")
    var Responsecell:String,
    @ColumnInfo(name = "IDName")
    var ResponseIDName:String,
    @ColumnInfo(name = "IDValue")
    var ResponseIDValue:String,
    @ColumnInfo(name = "PictureLarge")
    var ResponsePictureLarge:String,
    @ColumnInfo(name = "PictureMedium")
    var ResponsePictureMedium:String,
    @ColumnInfo(name = "PictureThumbnail")
    var ResponsePictureThumbnail:String,
    @ColumnInfo(name = "nat")
    var Responsenat:String,
    @ColumnInfo(name = "infoseed")
    var infoseed:String,
    @ColumnInfo(name = "inforesults")
    var inforesults:String,
    @ColumnInfo(name = "infopage")
    var infopage:String,
    @ColumnInfo(name = "infoversion")
    var infoversion:String

){

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id:Int = 1

}