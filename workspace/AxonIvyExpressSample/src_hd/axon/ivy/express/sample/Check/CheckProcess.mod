[Ivy]
17F69287BEDEA16B 9.3.1 #module
>Proto >Proto Collection #zClass
Cs0 CheckProcess Big #zClass
Cs0 RD #cInfo
Cs0 #process
Cs0 @AnnotationInP-0n ai ai #zField
Cs0 @TextInP .type .type #zField
Cs0 @TextInP .processKind .processKind #zField
Cs0 @TextInP .xml .xml #zField
Cs0 @TextInP .responsibility .responsibility #zField
Cs0 @UdInit f0 '' #zField
Cs0 @UdProcessEnd f1 '' #zField
Cs0 @PushWFArc f2 '' #zField
Cs0 @UdExitEnd f4 '' #zField
Cs0 @UdEvent f3 '' #zField
Cs0 @PushWFArc f5 '' #zField
>Proto Cs0 Cs0 CheckProcess #zField
Cs0 f0 guid 17F6513AEA9D558F #txt
Cs0 f0 method start(axon.ivy.express.sample.Check.CheckData) #txt
Cs0 f0 inParameterDecl '<axon.ivy.express.sample.Check.CheckData data> param;' #txt
Cs0 f0 inParameterMapAction 'out=param.data;
' #txt
Cs0 f0 outParameterDecl '<axon.ivy.express.sample.Check.CheckData data> result;' #txt
Cs0 f0 outParameterMapAction 'result.data=in;
' #txt
Cs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start</name>
    </language>
</elementInfo>
' #txt
Cs0 f0 83 51 26 26 -10 27 #rect
Cs0 f1 211 51 26 26 0 12 #rect
Cs0 f2 109 64 211 64 #arcP
Cs0 f4 211 147 26 26 0 12 #rect
Cs0 f3 guid 17FC174A8EFDF04B #txt
Cs0 f3 actionTable 'out=in;
' #txt
Cs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Cs0 f3 83 147 26 26 -15 15 #rect
Cs0 f5 109 160 211 160 #arcP
>Proto Cs0 .type axon.ivy.express.sample.Check.CheckData #txt
>Proto Cs0 .processKind HTML_DIALOG #txt
>Proto Cs0 -8 -8 16 16 16 26 #rect
Cs0 f0 mainOut f2 tail #connect
Cs0 f2 head f1 mainIn #connect
Cs0 f3 mainOut f5 tail #connect
Cs0 f5 head f4 mainIn #connect
