[Ivy]
1723A6863C77A4EE 9.3.1 #module
>Proto >Proto Collection #zClass
Es0 GuideOverlayPanelProcess Big #zClass
Es0 RD #cInfo
Es0 #process
Es0 @TextInP .type .type #zField
Es0 @TextInP .processKind .processKind #zField
Es0 @AnnotationInP-0n ai ai #zField
Es0 @MessageFlowInP-0n messageIn messageIn #zField
Es0 @MessageFlowOutP-0n messageOut messageOut #zField
Es0 @TextInP .xml .xml #zField
Es0 @TextInP .responsibility .responsibility #zField
Es0 @UdInit f0 '' #zField
Es0 @UdProcessEnd f1 '' #zField
Es0 @PushWFArc f2 '' #zField
Es0 @UdEvent f3 '' #zField
Es0 @UdExitEnd f4 '' #zField
Es0 @PushWFArc f5 '' #zField
>Proto Es0 Es0 GuideOverlayPanelProcess #zField
Es0 f0 guid 15276F281563C3C0 #txt
Es0 f0 method start() #txt
Es0 f0 inParameterDecl '<> param;' #txt
Es0 f0 outParameterDecl '<> result;' #txt
Es0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Es0 f0 53 85 22 22 14 0 #rect
Es0 f1 53 213 22 22 14 0 #rect
Es0 f2 expr out #txt
Es0 f2 64 107 64 213 #arcP
Es0 f3 guid 15276F2816DF8951 #txt
Es0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Es0 f3 149 85 22 22 14 0 #rect
Es0 f4 149 213 22 22 14 0 #rect
Es0 f5 expr out #txt
Es0 f5 160 107 160 213 #arcP
>Proto Es0 .type ch.ivy.addon.portalkit.component.GuideOverlayPanel.GuideOverlayPanelData #txt
>Proto Es0 .processKind HTML_DIALOG #txt
>Proto Es0 -8 -8 16 16 16 26 #rect
Es0 f0 mainOut f2 tail #connect
Es0 f2 head f1 mainIn #connect
Es0 f3 mainOut f5 tail #connect
Es0 f5 head f4 mainIn #connect
