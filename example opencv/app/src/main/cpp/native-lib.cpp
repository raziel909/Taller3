#include <jni.h>
#include <string>
#include "include C:\OpenCV-android-sdk\sdk\native\jniOpenCV.mk"
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_razie_holamundo_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello";
    return env->NewStringUTF(hello.c_str());
}
