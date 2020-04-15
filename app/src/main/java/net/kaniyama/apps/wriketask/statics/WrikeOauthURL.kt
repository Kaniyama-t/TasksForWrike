package net.kaniyama.apps.wriketask.statics

object WrikeOauthURL {
    private val wrikeClientID = "sH4bWHj4"

    val RequestPermissionURL =
        "https://login.wrike.com/oauth2/authorize/v4?client_id=$wrikeClientID&response_type=code"

}