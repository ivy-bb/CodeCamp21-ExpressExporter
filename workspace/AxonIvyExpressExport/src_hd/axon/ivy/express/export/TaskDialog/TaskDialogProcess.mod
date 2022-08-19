[Ivy]
1828D37A3EA60349 9.3.1 #module
>Proto >Proto Collection #zClass
Ts0 TaskDialogProcess Big #zClass
Ts0 RD #cInfo
Ts0 #process
Ts0 @AnnotationInP-0n ai ai #zField
Ts0 @TextInP .type .type #zField
Ts0 @TextInP .processKind .processKind #zField
Ts0 @TextInP .xml .xml #zField
Ts0 @TextInP .responsibility .responsibility #zField
Ts0 @UdInit f0 '' #zField
Ts0 @UdProcessEnd f1 '' #zField
Ts0 @PushWFArc f2 '' #zField
Ts0 @UdEvent f3 '' #zField
Ts0 @UdExitEnd f4 '' #zField
Ts0 @PushWFArc f5 '' #zField
>Proto Ts0 Ts0 TaskDialogProcess #zField
Ts0 f0 guid 1828D37A3EA4075E #txt
Ts0 f0 method start(axon.ivy.express.export.Order_GoodiesData) #txt
Ts0 f0 inParameterDecl '<axon.ivy.express.export.Order_GoodiesData data> param;' #txt
Ts0 f0 inParameterMapAction 'out.processData=param.data;
out.currentStep=ivy.task.customFields().numberField("stepindex").getOrDefault(0);
out.parallelIndex=ivy.task.customFields().numberField("parallelindex").getOrDefault(0);
' #txt
Ts0 f0 outParameterDecl '<axon.ivy.express.export.Order_GoodiesData data> result;' #txt
Ts0 f0 outParameterMapAction 'result.data=in.processData;
' #txt
Ts0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Order_GoodiesData)</name>
    </language>
</elementInfo>
' #txt
Ts0 f0 83 51 26 26 -71 15 #rect
Ts0 f1 211 51 26 26 0 12 #rect
Ts0 f2 109 64 211 64 #arcP
Ts0 f3 guid 1828D37A3EA35DEE #txt
Ts0 f3 actionTable 'out=in;
' #txt
Ts0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Ts0 f3 83 147 26 26 -15 15 #rect
Ts0 f4 211 147 26 26 0 12 #rect
Ts0 f5 109 160 211 160 #arcP
>Proto Ts0 .type axon.ivy.express.export.TaskDialog.TaskDialogData #txt
>Proto Ts0 .processKind HTML_DIALOG #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
Ts0 f0 mainOut f2 tail #connect
Ts0 f2 head f1 mainIn #connect
Ts0 f3 mainOut f5 tail #connect
Ts0 f5 head f4 mainIn #connect
