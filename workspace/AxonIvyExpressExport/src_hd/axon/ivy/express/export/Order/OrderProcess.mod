[Ivy]
18004555A9E57A51 9.3.1 #module
>Proto >Proto Collection #zClass
Os0 OrderProcess Big #zClass
Os0 RD #cInfo
Os0 #process
Os0 @AnnotationInP-0n ai ai #zField
Os0 @TextInP .type .type #zField
Os0 @TextInP .processKind .processKind #zField
Os0 @TextInP .xml .xml #zField
Os0 @TextInP .responsibility .responsibility #zField
Os0 @UdInit f0 '' #zField
Os0 @UdProcessEnd f1 '' #zField
Os0 @PushWFArc f2 '' #zField
Os0 @UdEvent f3 '' #zField
Os0 @UdExitEnd f4 '' #zField
Os0 @PushWFArc f5 '' #zField
>Proto Os0 Os0 OrderProcess #zField
Os0 f0 guid 18004555A9EAFD50 #txt
Os0 f0 method start(axon.ivy.express.export.Order.OrderData) #txt
Os0 f0 inParameterDecl '<axon.ivy.express.export.Order.OrderData data> param;' #txt
Os0 f0 inParameterMapAction 'out=param.data;
' #txt
Os0 f0 outParameterDecl '<axon.ivy.express.export.Order.OrderData data> result;' #txt
Os0 f0 outParameterMapAction 'result.data=in;
result.data.wfuser=in.wfuser.isEmpty() ? ivy.session.getSessionUserName() : in.wfuser;
' #txt
Os0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(OrderData)</name>
    </language>
</elementInfo>
' #txt
Os0 f0 83 51 26 26 -44 15 #rect
Os0 f1 211 51 26 26 0 12 #rect
Os0 f2 109 64 211 64 #arcP
Os0 f3 guid 18004555AAAF961B #txt
Os0 f3 actionTable 'out=in;
' #txt
Os0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Os0 f3 83 147 26 26 -15 15 #rect
Os0 f4 211 147 26 26 0 12 #rect
Os0 f5 109 160 211 160 #arcP
>Proto Os0 .type axon.ivy.express.export.Order.OrderData #txt
>Proto Os0 .processKind HTML_DIALOG #txt
>Proto Os0 -8 -8 16 16 16 26 #rect
Os0 f0 mainOut f2 tail #connect
Os0 f2 head f1 mainIn #connect
Os0 f3 mainOut f5 tail #connect
Os0 f5 head f4 mainIn #connect
