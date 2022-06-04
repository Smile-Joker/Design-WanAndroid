object Version {

    const val compileSdk = 32
    const val applicationId = "com.lowe.selfwanandroid"
    const val minSdk = 21
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "1.0"

    const val coreKtxVersion = "1.8.0"
    const val appCompatVersion = "1.4.2"
    const val materialVersion = "1.6.1"
    const val constraintLayoutVersion = "2.1.4"
    const val lifecycleVersion = "2.4.1"
    const val navigationVersion = "2.4.2"
    const val swipeRefreshLayoutVersion = "1.1.0"
    const val recyclerViewVersion = "1.2.1"

    // MultiAdapter
    const val multiTypeVersion = "4.3.0"

    // 网络
    const val retrofitVersion = "2.9.0"
    const val okHttp3Version = "4.9.3"
    const val gsonVersion = "2.9.0"

    const val testJunitVersion = "4.13.2"
    const val androidTestJunitAndroidExt = "1.1.3"
    const val androidTestEspressoCore = "3.4.0"
}

object Deps {

    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtxVersion}"
    const val appcompat = "androidx.appcompat:appcompat:${Version.appCompatVersion}"
    const val material = "com.google.android.material:material:${Version.materialVersion}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"
    const val lifecycleLiveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycleVersion}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycleVersion}"
    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Version.navigationVersion}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Version.navigationVersion}"
    const val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Version.swipeRefreshLayoutVersion}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Version.recyclerViewVersion}"
    const val multitype = "com.drakeet.multitype:multitype:${Version.multiTypeVersion}"
    const val testJunit = "junit:junit:${Version.testJunitVersion}"
    const val androidTestJunit = "androidx.test.ext:junit:${Version.androidTestJunitAndroidExt}"
    const val androidTestEspresso =
        "androidx.test.espresso:espresso-core:${Version.androidTestEspressoCore}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Version.okHttp3Version}"
    const val okhttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Version.okHttp3Version}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
    const val retrofitGsonConverter =
        "com.squareup.retrofit2:converter-gson:${Version.retrofitVersion}"
    const val gson = "com.google.code.gson:gson:${Version.gsonVersion}"
}