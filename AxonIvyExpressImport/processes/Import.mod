[Ivy]
17C36BA642A5E45C 9.3.0 #module
>Proto >Proto Collection #zClass
It0 Import Big #zClass
It0 B #cInfo
It0 #process
It0 @AnnotationInP-0n ai ai #zField
It0 @TextInP .type .type #zField
It0 @TextInP .processKind .processKind #zField
It0 @TextInP .xml .xml #zField
It0 @TextInP .responsibility .responsibility #zField
It0 @StartRequest f0 '' #zField
It0 @EndTask f1 '' #zField
It0 @UserDialog f2 '' #zField
It0 @PushWFArc f3 '' #zField
It0 @PushWFArc f4 '' #zField
>Proto It0 It0 Import #zField
It0 f0 outLink start.ivp #txt
It0 f0 inParamDecl '<> param;' #txt
It0 f0 requestEnabled true #txt
It0 f0 triggerEnabled false #txt
It0 f0 callSignature start() #txt
It0 f0 startName 'Import AxonIvy Express Workflow (.json)' #txt
It0 f0 caseData businessCase.attach=true #txt
It0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
    </language>
</elementInfo>
' #txt
It0 f0 @C|.responsibility Everybody #txt
It0 f0 81 49 30 30 -21 17 #rect
It0 f1 369 49 30 30 0 15 #rect
It0 f2 dialogId axon.ivy.express.impor.SelectAndImport #txt
It0 f2 startMethod start() #txt
It0 f2 requestActionDecl '<> param;' #txt
It0 f2 responseMappingAction 'out=in;
' #txt
It0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Import an &#13;
Express Workflow Definiton</name>
    </language>
</elementInfo>
' #txt
It0 f2 152 42 176 44 -69 -16 #rect
It0 f3 111 64 152 64 #arcP
It0 f4 328 64 369 64 #arcP
>Proto It0 .type axon.ivy.express.impor.Data #txt
>Proto It0 .processKind NORMAL #txt
>Proto It0 0 0 32 24 18 0 #rect
>Proto It0 @|BIcon #fIcon
It0 f0 mainOut f3 tail #connect
It0 f3 head f2 mainIn #connect
It0 f2 mainOut f4 tail #connect
It0 f4 head f1 mainIn #connect
