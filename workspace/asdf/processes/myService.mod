[Ivy]
180500E3683FEF66 9.3.1 #module
>Proto >Proto Collection #zClass
me0 myService Big #zClass
me0 WS #cInfo
me0 #process
me0 @TextInP .webServiceName .webServiceName #zField
me0 @TextInP .implementationClassName .implementationClassName #zField
me0 @TextInP .authenticationType .authenticationType #zField
me0 @AnnotationInP-0n ai ai #zField
me0 @TextInP .type .type #zField
me0 @TextInP .processKind .processKind #zField
me0 @TextInP .xml .xml #zField
me0 @TextInP .responsibility .responsibility #zField
me0 @StartWS f0 '' #zField
me0 @EndWS f1 '' #zField
me0 @PushWFArc f2 '' #zField
>Proto me0 me0 myService #zField
me0 f0 inParamDecl '<> param;' #txt
me0 f0 outParamDecl '<> result;' #txt
me0 f0 callSignature call() #txt
me0 f0 useUserDefinedException false #txt
me0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>call()</name>
    </language>
</elementInfo>
' #txt
me0 f0 81 49 30 30 -13 17 #rect
me0 f1 337 49 30 30 0 15 #rect
me0 f2 111 64 337 64 #arcP
>Proto me0 .webServiceName asdf.myService #txt
>Proto me0 .type asdf.Data #txt
>Proto me0 .processKind WEB_SERVICE #txt
>Proto me0 -8 -8 16 16 16 26 #rect
me0 f0 mainOut f2 tail #connect
me0 f2 head f1 mainIn #connect
