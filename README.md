# codeobscatingjava






-keep public class * {
	public <fields>;
}

-keepattributes Exceptions,InnerClasses,Signature,*Annotation*

-keepclassmembers, allowobfuscation class *{
	*;
}

-keepclassmembers class * {
	*** get*();
	void set*(***);
}
