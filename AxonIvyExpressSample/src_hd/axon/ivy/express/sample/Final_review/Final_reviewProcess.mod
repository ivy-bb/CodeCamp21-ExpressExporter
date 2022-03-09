[Ivy]
17F651DC092CEC7F 9.3.1 #module
>Proto >Proto Collection #zClass
Fs0 Final_reviewProcess Big #zClass
Fs0 RD #cInfo
Fs0 #process
Fs0 @AnnotationInP-0n ai ai #zField
Fs0 @TextInP .type .type #zField
Fs0 @TextInP .processKind .processKind #zField
Fs0 @TextInP .xml .xml #zField
Fs0 @TextInP .responsibility .responsibility #zField
Fs0 @UdInit f0 '' #zField
Fs0 @UdProcessEnd f1 '' #zField
Fs0 @PushWFArc f2 '' #zField
Fs0 @UdEvent f3 '' #zField
Fs0 @UdExitEnd f4 '' #zField
Fs0 @PushWFArc f5 '' #zField
>Proto Fs0 Fs0 Final_reviewProcess #zField
Fs0 f0 guid 17F651DC0BF3884D #txt
Fs0 f0 method start(axon.ivy.express.sample.Get_your_Goodies_Data) #txt
Fs0 f0 inParameterDecl '<axon.ivy.express.sample.Get_your_Goodies_Data indata> param;' #txt
Fs0 f0 inParameterMapAction 'out.check_goods_on_stock=param.indata.check_goods_on_stock;
out.give_your_order=param.indata.give_your_order;
' #txt
Fs0 f0 outParameterDecl '<axon.ivy.express.sample.Get_your_Goodies_Data get_your_Goodies_Data> result;' #txt
Fs0 f0 outParameterMapAction 'result.get_your_Goodies_Data.check_goods_on_stock=in.check_goods_on_stock;
result.get_your_Goodies_Data.give_your_order=in.give_your_order;
' #txt
Fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Get_your_Goodies_Data)</name>
    </language>
</elementInfo>
' #txt
Fs0 f0 83 51 26 26 -84 15 #rect
Fs0 f1 211 51 26 26 0 12 #rect
Fs0 f2 109 64 211 64 #arcP
Fs0 f3 guid 17F651DC0D163084 #txt
Fs0 f3 actionTable 'out=in;
' #txt
Fs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Fs0 f3 83 147 26 26 -15 15 #rect
Fs0 f4 211 147 26 26 0 12 #rect
Fs0 f5 109 160 211 160 #arcP
>Proto Fs0 .type axon.ivy.express.sample.Final_review.Final_reviewData #txt
>Proto Fs0 .processKind HTML_DIALOG #txt
>Proto Fs0 -8 -8 16 16 16 26 #rect
Fs0 f0 mainOut f2 tail #connect
Fs0 f2 head f1 mainIn #connect
Fs0 f3 mainOut f5 tail #connect
Fs0 f5 head f4 mainIn #connect
