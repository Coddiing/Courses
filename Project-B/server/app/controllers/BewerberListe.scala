package controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import play.mvc.Http.RequestHeader

object BewerberListe {
  private var userName = ""
  private var isSTM = false
  private var isGM = false
  private var isNew = false
  private var isSekr = false
  private var isAdmin = false
  private var isAAA = false
  private var isComm = -1 // Commission member number

  private var p = null
  private var all = ""

  def getIsSTM: Boolean = isSTM

  def getIsGM: Boolean = isGM

  def getIsAdmin: Boolean = isAdmin

  def getIsSekr: Boolean = isSekr

  def getUserName: String = userName

  def getIsComm: Boolean = isComm >= 0

  def getCommNr: Int = isComm

  def getIsAAA: Boolean = isAAA

  def isReadOnly(b: Boolean): String = {
    var res = ""
    if (b) res = "readonly"
    res
  }

  def isInvalidate(b: Boolean): String = {
    var res = ""
    if (b) res = "disabled"
    res
  }


}


